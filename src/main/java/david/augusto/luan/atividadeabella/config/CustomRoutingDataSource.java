package david.augusto.luan.atividadeabella.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Objects;

public class CustomRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {

        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)
                RequestContextHolder.getRequestAttributes();

        if(Objects.nonNull(servletRequestAttributes)) {
            return servletRequestAttributes.getRequest().getParameter("tenantID");
        }
        return "tenantID2";
    }
}
