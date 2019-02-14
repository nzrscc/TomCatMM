package it.services;

import it.DTO.UserDTO;
import it.models.CombinationModel;
import it.models.TryModel;

import java.util.ArrayList;
import java.util.Iterator;

public class UserService {
    private CombinationService combinationService;
    private TryService tryService;

    public UserService(CombinationService combinationService, TryService tryService) {
        this.combinationService=combinationService;
        this.tryService=tryService;
    }

    public ArrayList<UserDTO> prendiArrayList()
    {
        ArrayList<UserDTO> dtos = new ArrayList<>();

        ArrayList<CombinationModel> combinationList =combinationService.getArrayListModel();

        ArrayList<TryModel> tryList= tryService.getArrayListModel();

        Iterator<CombinationModel> it = combinationList.iterator();

        while(it.hasNext())
        {
            CombinationModel current = it.next();//da controllare ancora perdo il primo

            UserDTO dto = new UserDTO();

            dto.setID(current.getId());
            dto.setNome(current.getUsername());
            dto.setPunteggio(this.calcolaPunteggio(tryList,current.getId()));

            dtos.add(dto);
        }

        return dtos;
    }

    private double calcolaPunteggio(ArrayList<TryModel> list, int id){
        Iterator<TryModel> it= list.iterator();
        while(it.hasNext())
        {
            TryModel current=it.next();


        }
        return 4.0;
    }
}
