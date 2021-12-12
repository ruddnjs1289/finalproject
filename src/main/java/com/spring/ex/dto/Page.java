package com.spring.ex.dto;

public class Page {

	// ���� ������ ��ȣ
	private int num;

	// �Խù� �� ����
	private int count;

	// �� �������� ����� �Խù� ����
	private int postNum = 10;

	// �ϴ� ����¡ ��ȣ ([ �Խù� �� ���� �� �� �������� ����� ���� ]�� �ø�)
	private int pageNum;

	// ����� �Խù�
	private int displayPost;

	// �ѹ��� ǥ���� ����¡ ��ȣ�� ����
	private int pageNumCnt = 10;

	// ǥ�õǴ� ������ ��ȣ �� ������ ��ȣ
	private int endPageNum;

	// ǥ�õǴ� ������ ��ȣ �� ù��° ��ȣ
	private int startPageNum;

	// ����/���� ǥ�� ����
	private boolean prev;
	private boolean next;

	public void setNum(int num) {
		this.num = num;
	}

	public void setCount(int count) {
		this.count = count;
		dataCalc();
	}

	public int getCount() {
		return count;
	}

	public int getPostNum() {
		return postNum;
	}

	public int getPageNum() {
		return pageNum;
	}

	public int getDisplayPost() {
		return displayPost;
	}

	public int getPageNumCnt() {
		return pageNumCnt;
	}

	public int getEndPageNum() {
		return endPageNum;
	}

	public int getStartPageNum() {
		return startPageNum;
	}

	public boolean getPrev() {
		return prev;
	}

	public boolean getNext() {
		return next;
	}

	private void dataCalc() {

		// ������ ��ȣ
		endPageNum = (int) (Math.ceil((double) num / (double) pageNumCnt) * pageNumCnt);

		// ���� ��ȣ
		startPageNum = endPageNum - (pageNumCnt - 1);

		// ������ ��ȣ ����
		int endPageNum_tmp = (int) (Math.ceil((double) count / (double) pageNumCnt));

		if (endPageNum > endPageNum_tmp) {
			endPageNum = endPageNum_tmp;
		}

		prev = startPageNum == 1 ? false : true;
		next = endPageNum * pageNumCnt >= count ? false : true;

		displayPost = (num - 1) * postNum;

	}

	/* private String searchTypeKeyword; */

	/*
	 * public void setSearchTypeKeyword(String searchType, String keyword) {
	 * 
	 * if (searchType.equals("") || keyword.equals("")) { searchTypeKeyword = ""; }
	 * else { searchTypeKeyword = "&searchType=" + searchType + "&keyword=" +
	 * keyword; } }
	 */

	private String searchType;
	private String keyword;

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getSearchTypeKeyword() {

		if (searchType.equals("") || keyword.equals("")) {
			return "";
		} else {
			return "&searchType=" + searchType + "&keyword=" + keyword;
		}
	}

}
