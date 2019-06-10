package com.qmdx00.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yuanweimin
 * @date 19/06/10 16:26
 * @description 机器设备状态实体
 */
@Entity
@Table(name = "t_machine_status")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MachineStatus {
    // 机器编号
    @Id
    private String machine_id;
    // 温度
    private Double temperature;
    // 转速
    private Double speed;
}