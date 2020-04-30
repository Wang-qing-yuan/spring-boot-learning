package com.soft1851.springboot.mbp.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author 19500
 */
@Data
@Builder
public class Clazz {
    private int id;
    private String clazzName;
    private int teacherId;
}
