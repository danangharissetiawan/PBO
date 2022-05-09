package com.risset;

class Novel extends Print {
    private String Genre;
    private String Blurb;

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String GenreName) {
        this.Genre = GenreName;
    }

    public String getBlurb() {
        return Blurb;
    }

    public void setBlurb(String BlurbSummary) {
        this.Blurb = BlurbSummary;
    }

}

