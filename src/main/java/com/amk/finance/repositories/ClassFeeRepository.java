package com.amk.finance.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amk.finance.entity.FeeStructureEntity;

@Repository
public interface ClassFeeRepository extends CrudRepository<FeeStructureEntity, Integer> {

}
