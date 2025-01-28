package org.hiromy.springweb.service;

import org.hiromy.springweb.model.Manufacturer;
import org.hiromy.springweb.repository.ManufacturerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository repository;
    public ManufacturerServiceImpl(ManufacturerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Manufacturer> findAll() {

        return this.repository.findAll();
    }

    @Override
    public List<Manufacturer> findAllByYear(Integer year) {
        Objects.requireNonNull(year);
        return this.repository.findAllByYear(year);
    }

    @Override
    public Optional<Manufacturer> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Optional<Manufacturer> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Manufacturer save(Manufacturer manufacturer) {
        return this.repository.save(manufacturer);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        this.repository.deleteAll();
    }
}
