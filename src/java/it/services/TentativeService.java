package it.services;

import it.DTO.TentativoDTO;
import it.models.CombinationModel;
import it.models.TryModel;
import it.services.utils.ClassificheService;

import java.util.ArrayList;
import java.util.Iterator;

public class TentativeService implements ClassificheService {

    private CombinationService combinationService;
    private TryService tryService;

    public TentativeService(CombinationService combinationService, TryService tryService) {
        this.combinationService=combinationService;
        this.tryService=tryService;
    }

    @Override
    public ArrayList<TentativoDTO> prendiArrayList()
    {
        int id;

        ArrayList<TentativoDTO> dtos = new ArrayList<>();

        ArrayList<CombinationModel> combinationList =combinationService.getArrayListModel();

        ArrayList<TryModel> tryList= tryService.getArrayListModel();

        Iterator<TryModel> it = tryList.iterator();
        System.out.println("sono prima del while");
        while(it.hasNext())
        {
            System.out.println("Ci sono");
            TryModel current=it.next();
            TentativoDTO dto = new TentativoDTO();
            id=(current.getIdComb());
            dto.setPosEsatta(current.getPosEsatta());
            dto.setNumEsatto(current.getNumEsatto());
            dto.setInput(current.getInput());
            dto.setnTentativi(current.getId());
            dto.setUser(this.prendiUser(combinationList, id));
            dto.setSoluzione(this.prendiSoluzione(combinationList,id));
            dtos.add(dto);
            System.out.println("User= "+ dto.getUser()+" nTentativi= "+current.getId()+" "+"\tPosEsatta= "+current.getPosEsatta()+"\tNumEsatto= "+current.getNumEsatto()
                    +"\tSoluzione= "+dto.getSoluzione()+"\tInput= "+current.getInput());
        }

        return dtos;
    }


    public String prendiUser(ArrayList<CombinationModel> list, int id){
        Iterator<CombinationModel> it= list.iterator();
        while(it.hasNext()) {
            CombinationModel current = it.next();
            if (current.getId() == id) {
                return current.getUsername();
            }
        }
        return null;
    }


    public String prendiSoluzione(ArrayList<CombinationModel> list, int id){
        Iterator<CombinationModel> it= list.iterator();
        while(it.hasNext()) {
            CombinationModel current = it.next();
            if (current.getId() == id) {
                return current.getSoluzione();
            }
        }
        return null;
    }
}
