/**
 * 
 */
package com.rslakra.names.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rslakra.names.model.Name;
import com.rslakra.names.services.NameService;

/**
 * @author Rohtash Lakra
 */
@RestController
@RequestMapping(value = "${api.version}")
public class NameController {

	@Autowired
	private NameService service;

	/**
	 * Adds the record of the new name.
	 * 
	 * @param id
	 * @param name
	 * @return
	 */
	@PostMapping(value = "/names")
	public @ResponseBody Name create(@RequestBody Name name) {
		return service.create(name);
	}

	/**
	 * Returns the list of names.
	 * 
	 * @return
	 */
	@GetMapping(value = "/names")
	public @ResponseBody List<Name> getNames() {
		return service.getNames();
	}

	/**
	 * Returns the name for the specified <code>id</code>.
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/names/{id}")
	public @ResponseBody Name getName(@PathVariable Long id) {
		return service.getName(id);
	}

	/**
	 * Updates the name for the specified <code>id</code>.
	 * 
	 * @param id
	 * @param name
	 * @return
	 */
	@PostMapping(value = "/names/{id}")
	public @ResponseBody Name update(@PathVariable Long id, @RequestBody Name name) {
		return service.update(id, name);
	}

	/**
	 * Deletes the name for the specified <code>id</code>.
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/names/{id}")
	public @ResponseBody Name delete(@PathVariable Long id) {
		return service.delete(id);
	}

//	/**
//	 * Returns the list of names by first name.
//	 * 
//	 * @param firstName
//	 * @return
//	 */
//	@GetMapping(value = "/names/{firstName}")
//	public @ResponseBody List<Name> findByFirstName(@RequestParam String firstName) {
//		return service.findByFirstName(firstName);
//	}
//
//	/**
//	 * Returns the list of names by middle name.
//	 * 
//	 * @param middleName
//	 * @return
//	 */
//	@GetMapping(value = "/names/{middleName}")
//	public @ResponseBody List<Name> findByMiddleName(@RequestParam String middleName) {
//		return service.findByMiddleName(middleName);
//	}
//
//	/**
//	 * Returns the list of names by last name.
//	 * 
//	 * @param lastName
//	 * @return
//	 */
//	@GetMapping(value = "/names/{lastName}")
//	public @ResponseBody List<Name> findByLastName(@RequestParam String lastName) {
//		return service.findByLastName(lastName);
//	}

}
