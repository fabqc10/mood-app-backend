package fabdev.moodapi.controller;

import fabdev.moodapi.model.Feeling;
import fabdev.moodapi.model.FeelingDTO;
import fabdev.moodapi.service.FeelingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/moodwave")
public class FeelingController {
 private FeelingService service;

    public FeelingController(FeelingService service) {
        this.service = service;
    }

    @RequestMapping
    public ResponseEntity<List<Feeling>>getAllFeelings(){
        return ResponseEntity.ok(service.getAllFeelings());
    }

    @PostMapping
    public ResponseEntity<Feeling> createFeeling(@RequestBody FeelingDTO dto) {
        Feeling newFeeling = service.createFeeling(dto);
        return ResponseEntity.accepted().body(newFeeling);
    }

}
