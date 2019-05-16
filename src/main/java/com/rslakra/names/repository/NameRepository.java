/**
 * 
 */
package com.rslakra.names.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rslakra.names.model.Name;

/**
 * @author Rohtash Lakra
 */
@Repository
public interface NameRepository extends JpaRepository<Name, Long> {

}
