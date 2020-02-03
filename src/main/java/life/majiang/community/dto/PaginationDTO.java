package life.majiang.community.dto;

import lombok.Data;

import java.util.List;
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
}
