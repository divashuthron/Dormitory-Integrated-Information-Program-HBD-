package www.kopohanbando.com.notice.vo;

import java.util.Date;

public class NoticeVO {
	private int noticeNumber;
	private String noticeTitle;
	private String noticeContent;
	private Date insertDate;
	private String noticePicture;
	
	public int getNoticeNumber() {
		return noticeNumber;
	}
	public void setNoticeNumber(int noticeNumber) {
		this.noticeNumber = noticeNumber;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public String getNoticePicture() {
		return noticePicture;
	}
	public void setNoticePicture(String noticePicture) {
		this.noticePicture = noticePicture;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[��������] "
		+ "�������� ��ȣ: " + noticeNumber
		+ "�������� ����: " + noticeTitle
		+ "����: " + noticeContent
		+ "���� ��¥: " + insertDate
		+ "����: " + noticePicture;
	}
	
}
