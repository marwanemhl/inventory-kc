package org.sig.inventory.repository;

import org.sig.inventory.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestController
public interface ProductRepository extends JpaRepository<Product,Long> {

}
