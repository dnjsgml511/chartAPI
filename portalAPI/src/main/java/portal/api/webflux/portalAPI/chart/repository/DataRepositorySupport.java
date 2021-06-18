package portal.api.webflux.portalAPI.chart.repository;

import static portal.api.webflux.portalAPI.entity.QRandomdata1.randomdata1;
import static portal.api.webflux.portalAPI.entity.QRandomdata2.randomdata2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

import portal.api.webflux.portalAPI.chart.vo.DataVO;
import portal.api.webflux.portalAPI.entity.Randomdata1;
import portal.api.webflux.portalAPI.entity.Randomdata2;

@Repository
public class DataRepositorySupport extends QuerydslRepositorySupport {

	public DataRepositorySupport() {
		super(Randomdata1.class);
	}

	@Override
	@PersistenceContext(unitName = "EntityManager")
	public void setEntityManager(EntityManager entityManager) {
		super.setEntityManager(entityManager);
		em = entityManager;
		this.queryFactory = new JPAQueryFactory(entityManager);
	}

	private EntityManager em;
	private JPAQueryFactory queryFactory;

	// select 목록
	public List<Randomdata1> findByData1(DataVO vo) {
		List<Randomdata1> query = queryFactory
				.select(Projections.bean(Randomdata1.class, randomdata1.data1, randomdata1.data2)).from(randomdata1)
				.fetch();
		return query;
	}
	// select 목록
	public List<Randomdata2> findByData2(DataVO vo) {
		List<Randomdata2> query = queryFactory
				.select(Projections.bean(Randomdata2.class, randomdata2.data1, randomdata2.data2)).from(randomdata2)
				.fetch();
		return query;
	}
}
