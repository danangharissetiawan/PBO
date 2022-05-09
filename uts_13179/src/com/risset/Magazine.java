package com.risset;

class Megazine extends Print{
    private int ISSN;
    private int issue;

    public int getISSN() {
        return ISSN;
    }

    public void setISSN( int issn_num){
        this.ISSN = issn_num;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue_num) {
        this.issue = issue_num;
    }

}
