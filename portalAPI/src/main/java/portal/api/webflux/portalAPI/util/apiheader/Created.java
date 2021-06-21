package portal.api.webflux.portalAPI.util.apiheader;

public class Created implements ApiHeaderInterface {

	// 새 리소스가 성공적으로 생성되었습니다.
	public ApiVO header() {
		ApiVO vo = new ApiVO();
		vo.setStatus(201);
		vo.setName("Created");

		return vo;
	}
}
