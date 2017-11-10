package com.zc.sys.core.credit.entity;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.zc.sys.common.entity.LongPKEntity;
import com.zc.sys.core.common.constant.BaseConstant;
/**
 * 信用分账户
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月09日
 */
@Entity
@Table(name=BaseConstant.DB_PREFIX + BaseConstant.DB_MODEL_Cs + "_credit_score")
public class CreditScore extends LongPKEntity {
	/** 序列号 **/
	private static final long serialVersionUID = 1L;

}