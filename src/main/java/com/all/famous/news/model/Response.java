package com.all.famous.news.model;

import java.util.List;
import java.util.Objects;

/**
 * The type Response.
 *
 * @param <T> the type parameter
 */
public class Response<T> {

    private List<T> data;
    private Long count;

    /**
     * Instantiates a new Response.
     */
    public Response() {
    }

    /**
     * Instantiates a new Response.
     *
     * @param data  the data
     * @param count the count
     */
    public Response(List<T> data, Long count) {
        this.data = data;
        this.count = count;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response<?> response = (Response<?>) o;
        return Objects.equals(data, response.data) &&
                Objects.equals(count, response.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, count);
    }

    @Override
    public String toString() {
        return "Response{" +
                "data=" + data +
                ", count=" + count +
                '}';
    }
}
