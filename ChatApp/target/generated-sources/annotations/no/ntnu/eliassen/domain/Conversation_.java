package no.ntnu.eliassen.domain;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import no.ntnu.eliassen.domain.Message;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-24T20:04:50")
@StaticMetamodel(Conversation.class)
public class Conversation_ { 

    public static volatile ListAttribute<Conversation, Message> messages;
    public static volatile SingularAttribute<Conversation, String> id;
    public static volatile SingularAttribute<Conversation, Timestamp> version;

}