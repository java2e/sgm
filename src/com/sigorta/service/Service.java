package com.sigorta.service;

import java.util.List;

public interface Service<T> {

    public T kaydet(T model);
    public List<T> getList();
}
