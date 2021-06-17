package portal.api.webflux.portalAPI.chart.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import portal.api.webflux.portalAPI.chart.repository.DataRepositoryInsert;
import portal.api.webflux.portalAPI.entity.Randomdata1;

@Service(value = "dataServiceImpl_ins")
@RequiredArgsConstructor
public class DataServiceImpl_ins implements DataService_ins {

	private final DataRepositoryInsert ins;

	@Transactional
	public int insertData() throws Exception {

		Randomdata1 rd = new Randomdata1();

		double random = Math.random();
		int first = (int) (random * 100);
		int second = (int) (random * 100);

		rd.setData1(first);
		rd.setData2(second);

		ins.save(rd);

		return 1;
	}
}
