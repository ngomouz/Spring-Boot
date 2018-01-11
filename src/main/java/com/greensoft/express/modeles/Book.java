package com.greensoft.express.modeles;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

@Entity
public class Book implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;
    private String publisher;
    private int nomberPages;
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Collection<Author> authors = new HashSet<>();

    public Book()
    {

    }

    public Book(String title, String isbn, String publisher, int nomberPages)
    {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.nomberPages = nomberPages;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public int getNomberPages()
    {
        return nomberPages;
    }

    public void setNomberPages(int nomberPages)
    {
        this.nomberPages = nomberPages;
    }

    public Collection<Author> getAuthors()
    {
        return authors;
    }

    public void setAuthors(Collection<Author> authors)
    {
        this.authors = authors;
    }
}
