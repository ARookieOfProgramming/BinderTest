// IBookManager.aidl
package com.zhouzhou.bindertest;
import com.zhouzhou.bindertest.Book;
// Declare any non-default types here with import statements

interface IBookManager {
    List<Book> getBookList();
    void AddBook(in Book book);
}
