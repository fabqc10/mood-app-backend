package fabdev.moodapi.model;

import java.time.LocalDate;

public record FeelingDTO(LocalDate date, String mood, String description) {
}
