package uz.pdp.g33properitiesandasyn.config;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Application {
    private String name;
    private List<String> languages;
}
