package fabdev.moodapi.service;

import fabdev.moodapi.model.Feeling;
import fabdev.moodapi.model.FeelingDTO;
import fabdev.moodapi.repository.FeelingRepo;

import java.util.List;

@org.springframework.stereotype.Service
public class FeelingService {
    private FeelingRepo repo;

    public FeelingService(FeelingRepo repo) {
        this.repo = repo;
    }

    public List<Feeling> getAllFeelings() {
        return repo.findAll();
    }

    public Feeling createFeeling(FeelingDTO dto) {
        Feeling newFeeling = new Feeling();
        newFeeling.setDate(dto.date());
        newFeeling.setMood(dto.mood());
        newFeeling.setDescription(dto.description());
        System.out.println(newFeeling);
        return repo.save(newFeeling);
    }

}
