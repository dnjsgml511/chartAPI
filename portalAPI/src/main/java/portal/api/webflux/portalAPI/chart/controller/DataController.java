package portal.api.webflux.portalAPI.chart.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import portal.api.webflux.portalAPI.chart.service.DataServiceImpl;
import portal.api.webflux.portalAPI.chart.service.DataServiceImpl_ins;
import portal.api.webflux.portalAPI.chart.vo.DataVO;
import reactor.core.publisher.Flux;

@RestController
@CrossOrigin("*")
public class DataController {

	@Resource(name = "dataServiceImpl")
	private DataServiceImpl service;
	@Resource(name = "dataServiceImpl_ins")
	private DataServiceImpl_ins ins_service;

	// selectbox 可记
	@GetMapping("/data1.api")
	public Flux<List<?>> findByData1(DataVO vo) throws Exception {
		ins_service.insertData1();
		return service.findByData1(vo);
	}

	// selectbox 可记
	@GetMapping("/data2.api")
	public Flux<List<?>> findByData2(DataVO vo) throws Exception {
		ins_service.insertData2();
		return service.findByData2(vo);
	}
}
