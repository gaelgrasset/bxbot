package com.gazbert.bxbot.datastore;


/**
 * Locations of XML and XSD files for the entities.
 *
 * @author gazbert
 */
public final class FileLocations {

    /*
     * Location of the XML config files relative to project/installation root.
     */
    public static final String EMAIL_ALERTS_CONFIG_XML_FILENAME = "config/email-alerts.xml";
    public static final String ENGINE_CONFIG_XML_FILENAME = "config/engine.xml";
    public static final String EXCHANGE_CONFIG_XML_FILENAME = "config/exchange.xml";
    public static final String MARKETS_CONFIG_XML_FILENAME = "config/markets.xml";
    public static final String STRATEGIES_CONFIG_XML_FILENAME = "config/strategies.xml";

    /*
     * XSD schema files for validating the XML config - their location in the main/resources folder.
     */
    public static final String EMAIL_ALERTS_CONFIG_XSD_FILENAME = "com/gazbert/bxbot/datastore/config/emailalerts/email-alerts.xsd";
    public static final String ENGINE_CONFIG_XSD_FILENAME = "com/gazbert/bxbot/datastore/config/engine/engine.xsd";
    public static final String EXCHANGE_CONFIG_XSD_FILENAME = "com/gazbert/bxbot/datastore/config/exchange/exchange.xsd";
    public static final String MARKETS_CONFIG_XSD_FILENAME = "com/gazbert/bxbot/datastore/config/market/markets.xsd";
    public static final String STRATEGIES_CONFIG_XSD_FILENAME = "com/gazbert/bxbot/datastore/config/strategy/strategies.xsd";


    private FileLocations() {
    }
}
