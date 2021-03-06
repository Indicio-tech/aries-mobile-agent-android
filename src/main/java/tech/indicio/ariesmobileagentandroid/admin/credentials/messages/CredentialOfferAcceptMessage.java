package tech.indicio.ariesmobileagentandroid.admin.credentials.messages;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

import tech.indicio.ariesmobileagentandroid.admin.messages.BaseOutboundAdminMessage;

public class CredentialOfferAcceptMessage extends BaseOutboundAdminMessage {
    @SerializedName("@type")
    public final static String type = "did:sov:BzCbsNYhMrjHiqZDTUASHg;spec/admin-holder/0.1/credential-offer-accept";

    @SerializedName("credential_exchange_id")
    public String credentialExchangeId;

    public CredentialOfferAcceptMessage(String credentialExchangeId) {
        this.id = UUID.randomUUID().toString();
        this.credentialExchangeId = credentialExchangeId;
    }
}
