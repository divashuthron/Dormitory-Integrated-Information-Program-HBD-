package www.kopohanbando.com.stayoutapply.vo;

import java.util.Date;

public class stayOutApplyVO {
	private int articleNumber;
	private Date insertDate;
	private Date deadLineDate;
	private String cause;
	
	public int getArticleNumber() {
		return articleNumber;
	}
	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Date getDeadLineDate() {
		return deadLineDate;
	}
	public void setDeadLineDate(Date deadLineDate) {
		this.deadLineDate = deadLineDate;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[�ܹ� ��û] "
		+ "�� ��ȣ: " + articleNumber
		+ "������ ��¥: " + insertDate
		+ "������ ��¥: " + deadLineDate
		+ "����: " + cause;
	}
}
