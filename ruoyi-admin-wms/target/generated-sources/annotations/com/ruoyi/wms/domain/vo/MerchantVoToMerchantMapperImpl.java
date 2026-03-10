package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.Merchant;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class MerchantVoToMerchantMapperImpl implements MerchantVoToMerchantMapper {

    @Override
    public Merchant convert(MerchantVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Merchant merchant = new Merchant();

        merchant.setId( arg0.getId() );
        merchant.setMerchantCode( arg0.getMerchantCode() );
        merchant.setMerchantName( arg0.getMerchantName() );
        merchant.setMerchantType( arg0.getMerchantType() );
        merchant.setMerchantLevel( arg0.getMerchantLevel() );
        merchant.setContactPerson( arg0.getContactPerson() );
        merchant.setRemark( arg0.getRemark() );

        return merchant;
    }

    @Override
    public Merchant convert(MerchantVo source, Merchant target) {
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
