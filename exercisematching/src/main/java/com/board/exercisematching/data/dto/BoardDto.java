package com.board.exercisematching.data.dto;




/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString*/

// Annotation 추가 한다면 private board_id,title,content 이외의 다른 코드는
// 생략 가능하다 lombok 라이브러리에서 데이터를 사용하므로.

import java.math.BigInteger;

public class BoardDto {

    private BigInteger board_id;
    private String title;

    private String content;

    public BoardDto(String title, String content, BigInteger board_id) {
        this.board_id = board_id;
        this.title = title;
        this.content = content;
    }

    public BigInteger getBoard_id() {
        return board_id;
    }
    public void setBoard_id(BigInteger board_id) {
        this.board_id = board_id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
