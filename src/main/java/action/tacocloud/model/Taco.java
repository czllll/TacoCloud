package action.tacocloud.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
public class Taco{
    private String name;
    private List<String> ingredients;
}
