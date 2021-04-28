package com.example.tugasbottomnav;

import android.os.Parcel;
import android.os.Parcelable;

public class VacationModel implements Parcelable{
    private String name;
    private String summary;
    private int photo;

    public VacationModel(){}

    protected VacationModel(Parcel in){
        name = in.readString();
        summary = in.readString();
        photo = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(name);
        dest.writeString(summary);
        dest.writeInt(photo);
    }
    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<VacationModel> CREATOR = new Parcelable.Creator<VacationModel>() {
        @Override
        public VacationModel createFromParcel(Parcel in) {
            return new VacationModel(in);
        }

        @Override
        public VacationModel[] newArray(int size) {
            return new VacationModel[size];
        }
    };




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }



}
