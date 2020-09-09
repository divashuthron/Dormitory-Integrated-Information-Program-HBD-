package www.kopohanbando.com.penalty.vo;

import java.util.Date;

public class PenaltyVO {
	private int articleNumber;
	private int penalytyTotalScore;
	private String penaltyState;
	private String penaltyName;
	private Date penaltyDate;
	private int penaltyScore;
	private String approvalRequestState;
	
	
	public int getArticleNumber() {
		return articleNumber;
	}


	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}


	public int getPenalytyTotalScore() {
		return penalytyTotalScore;
	}


	public void setPenalytyTotalScore(int penalytyTotalScore) {
		this.penalytyTotalScore = penalytyTotalScore;
	}


	public String getPenaltyState() {
		return penaltyState;
	}


	public void setPenaltyState(String penaltyState) {
		this.penaltyState = penaltyState;
	}


	public String getPenaltyName() {
		return penaltyName;
	}


	public void setPenaltyName(String penaltyName) {
		this.penaltyName = penaltyName;
	}


	public Date getPenaltyDate() {
		return penaltyDate;
	}


	public void setPenaltyDate(Date penaltyDate) {
		this.penaltyDate = penaltyDate;
	}


	public int getPenaltyScore() {
		return penaltyScore;
	}


	public void setPenaltyScore(int penaltyScore) {
		this.penaltyScore = penaltyScore;
	}


	public String getApprovalRequestState() {
		return approvalRequestState;
	}


	public void setApprovalRequestState(String approvalRequestState) {
		this.approvalRequestState = approvalRequestState;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[���� ����] "
		+ "�� ��ȣ: " + articleNumber
		+ "���� �� ����: " + penalytyTotalScore
		+ "���� ����: " + penaltyState
		+ "���� �̸�:  " + penaltyName
		+ "���� ��¥ : " + penaltyDate
		+ "���� ����: " + penaltyScore
		+ "���� ���� ����: " + approvalRequestState;
	}
}
