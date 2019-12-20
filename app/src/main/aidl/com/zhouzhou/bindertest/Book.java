package com.zhouzhou.bindertest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * author : ZhouZhou
 * e-mail : zhou.zhou@sim.com
 * date   : 19-12-20下午5:19
 * desc   :
 * version: 1.0
 */
public class Book implements Parcelable {
    public int bookId;
    public String BookName;

    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        BookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }


    protected Book(Parcel in) {
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
