package www.kopohanbando.com.complain.vo;

import java.util.Date;

public class ComplainVO {
	private int articleNumber;
	private int roomNumber;
	private String articleType;
	private Date insertDate;
	private String attachedFile;
	private String articleContent;
	
	public int getArticleNumber() {
		return articleNumber;
	}
	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getArticleType() {
		return articleType;
	}
	public void setArticleType(String articleType) {
		this.articleType = articleType;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public String getAttachedFile() {
		return attachedFile;
	}
	public void setAttachedFile(String attachedFile) {
		this.attachedFile = attachedFile;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[���� �Ҹ�/���ǻ���] "
		+ "�� ��ȣ: " + articleNumber
		+ "ȣ��: " + roomNumber
		+ "������ ��¥: " + insertDate
		+ "����: " + attachedFile
		+ "����: " + articleContent;
	}
}
