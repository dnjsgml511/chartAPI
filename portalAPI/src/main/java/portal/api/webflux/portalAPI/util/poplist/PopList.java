package portal.api.webflux.portalAPI.util.poplist;

import java.util.List;

/**
 * 
 * ����( Strategy ) ����
 * 
 * @since 2021.06.13
 * @author lwh
 *
 */

public class PopList {

	public List<?> popList(PopListInterface popListInterface, List<?> list, String name) throws Exception {
		return popListInterface.type(list, name);
	}
}
