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
    //此处code,count,data严格按照layui设计
    //结果状态码
    private int status;
    //返回类型
    private int type;
}
