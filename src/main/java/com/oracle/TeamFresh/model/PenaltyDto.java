package com.oracle.TeamFresh.model;

import lombok.Data;

@Data
public class PenaltyDto {
	
	//페널티 등록 DTO
	private String penalty_no; // 페널티 코드
	private String voc_no; // voc코드
	private String compensation_no; // 배상번호
	private String app_push_flag; // 페널티 푸시 확인여부   default = 'N'
	private String penalty_accept_flag; // 페널티 인정 여부 default = 'N'
	private String creation_user_id; // 등록자(직원)
	private String creation_date; // 등록일시

}
