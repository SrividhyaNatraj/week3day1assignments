package org.college;

public class College {
	private String collegeName;
    private String collegeCode;
    private int collegeRank;

    public College(String collegeName, String collegeCode, int collegeRank) {
        this.collegeName = collegeName;
        this.collegeCode = collegeCode;
        this.collegeRank = collegeRank;
    }

  public String collegeName() {
        return collegeName;
    }

    public String collegeCode() {
        return collegeCode;
    }

    public int collegeRank() {
        return collegeRank;
    }
}
