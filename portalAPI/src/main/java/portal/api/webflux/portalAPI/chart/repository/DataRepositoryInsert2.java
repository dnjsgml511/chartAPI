package portal.api.webflux.portalAPI.chart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import portal.api.webflux.portalAPI.entity.Randomdata2;

@Repository
public interface DataRepositoryInsert2 extends  JpaRepository<Randomdata2, Integer>{
}
