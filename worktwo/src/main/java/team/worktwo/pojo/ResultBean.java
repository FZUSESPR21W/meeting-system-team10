package team.worktwo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ToString
public class ResultBean implements Serializable {
    //结果状态码
    private int code;
    //
    private String msg;
    //返回类型
    private int type;
}
