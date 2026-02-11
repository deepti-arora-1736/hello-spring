package org.deepti.repository;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();

}
