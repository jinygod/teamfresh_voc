package com.oracle.TeamFresh.model;

import lombok.Data;

@Data
public class VocDto {
	
	private String voc_no; //VOC코드 (sequence로 입력처리)
	private String client_no; //고객사 코드
	private String logis_no; //운송사 코드
	private String dman_no;  // 배송기사 코드
	private String cause_user_id; // 귀책 당사자 : L(운송사), C(고객사)
	private String discontent_reason; // 귀책 사유
	private String claim_flag; //  클레임 인입여부  Y => default
	private String compensation_flag; //  배상요청여부 (Y,N)
	private String creation_user_id; // 등록자(직원)
	private String creation_date; //  등록일시
	
}
