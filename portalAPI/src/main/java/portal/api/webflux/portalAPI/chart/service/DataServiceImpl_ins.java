package portal.api.webflux.portalAPI.chart.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import portal.api.webflux.portalAPI.chart.repository.DataRepositoryInsert1;
import portal.api.webflux.portalAPI.chart.repository.DataRepositoryInsert2;
import portal.api.webflux.portalAPI.entity.Randomdata1;
import portal.api.webflux.portalAPI.entity.Randomdata2;

@Service(value = "dataServiceImpl_ins")
@RequiredArgsConstructor
public class DataServiceImpl_ins {

	private final DataRepositoryInsert1 ins1;
	private final DataRepositoryInsert2 ins2;

	@Transactional
	public int insertData1() throws Exception {

		Randomdata1 rd = new Randomdata1();

		double random1 = Math.random();
		double random2 = Math.random();
		int first = (int) (random1 * 100);
		int second = (int) (random2 * 100);

		rd.setData1(first);
		rd.setData2(second);

		ins1.save(rd);

		return 1;
	}
	@Transactional
	public int insertData2() throws Exception {
		
		Randomdata2 rd = new Randomdata2();
		
		double random1 = Math.random();
		double random2 = Math.random();
		int first = (int) (random1 * 100);
		int second = (int) (random2 * 100);
		
		rd.setData1(first);
		rd.setData2(second);
		
		ins2.save(rd);
		
		return 1;
	}
}
