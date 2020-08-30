package com.example.testmybatisctable.dal.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sunflower
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "wechat_unionid_help")
public class WechatUnionidHelp {
    @IsKey
    @IsAutoIncrement
    @Column
    private Long id;

    @Column(name = "app_id", type = MySqlTypeConstant.VARCHAR, length = 11)
    private String appid;


    @Column(name = "unionid", type = MySqlTypeConstant.VARCHAR, length = 11)
    private String unionid;

    @Column(name = "te", type = MySqlTypeConstant.VARCHAR, length = 11)
    private String te;
}
