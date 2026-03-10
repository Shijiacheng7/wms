package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.MerchantVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class MerchantToMerchantVoMapperImpl implements MerchantToMerchantVoMapper {

    @Override
    public MerchantVo convert(Merchant arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MerchantVo merchantVo = new MerchantVo();

        merchantVo.setId( arg0.getId() );
        merchantVo.setMerchantCode( arg0.getMerchantCode() );
        merchantVo.setMerchantName( arg0.getMerchantName() );
        merchantVo.setMerchantType( arg0.getMerchantType() );
        merchantVo.setMerchantLevel( arg0.getMerchantLevel() );
        merchantVo.setContactPerson( arg0.getContactPerson() );
        merchantVo.setRemark( arg0.getRemark() );

        return merchantVo;
    }

    @Override
    public MerchantVo convert(Merchant source, MerchantVo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setMerchantCode( source.getMerchantCode() );
        target.setMerchantName( source.getMerchantName() );
        target.setMerchantType( source.getMerchantType() );
        target.setMerchantLevel( source.getMerchantLevel() );
        target.setContactPerson( source.getContactPerson() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
