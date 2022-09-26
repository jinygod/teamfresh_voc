package com.oracle.TeamFresh.model;

import lombok.Data;

@Data
public class GetVocListDto {
	// getVocListDto(VOC 목록 API용 DTO)
	private String voc_no; // voc번호
	private String causer_name; // 귀책 당사자명(고객사 또는 운송사)
	private String discontent_reason; // 귀책 내용
	private String dman_name; // 배송 기사명
	private String compensation_no; // 배상 번호(배상 정보 구분용 배상 테이블의 PK)
	private String penalty_no; // 페널티 번호(페널티 정보 구분용 페널티 테이블의 PK)
	private String penalty_accept_flag; // 페널티 인정여부(페널티 인정시 이의제기X, 페널티 불인정시 이의제기O)
	private String app_push_flag; // 기사 페널티 확인 여부
}
