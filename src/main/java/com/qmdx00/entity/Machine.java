package com.qmdx00.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author yuanweimin
 * @date 19/06/10 16:11
 * @description 机器设备实体
 */
@Entity
@Table(name = "t_machine")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Machine {
    // 机器编号
    @Id
    private String machine_id;
    // 机器名称
    private String name;
    // 描述
    private String machine_desc;
    // 类型
    private String type;
    // 购买日期
    private Date buy_time;
}
