package portal.api.webflux.portalAPI.chart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import portal.api.webflux.portalAPI.entity.Randomdata1;

@Repository
public interface DataRepositoryInsert1 extends  JpaRepository<Randomdata1, Integer>{
}
