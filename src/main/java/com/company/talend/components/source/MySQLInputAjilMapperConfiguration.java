package com.company.talend.components.source;

import java.io.Serializable;

import com.company.talend.components.dataset.CustomDataset;

import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.configuration.ui.widget.Credential;
import org.talend.sdk.component.api.meta.Documentation;

@GridLayout({
    // the generated layout put one configuration entry per line,
    // customize it as much as needed
    @GridLayout.Row({ "dataset" }),
    @GridLayout.Row({ "url" }),
    @GridLayout.Row({ "username" }),
    @GridLayout.Row({ "configuration4" }),
    @GridLayout.Row({ "password" })
})
@Documentation("TODO fill the documentation for this configuration")
public class MySQLInputAjilMapperConfiguration implements Serializable {
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private CustomDataset dataset;

    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private java.net.URL url;

    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String username;

    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String configuration4;

    @Credential
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String password;

    public CustomDataset getDataset() {
        return dataset;
    }

    public MySQLInputAjilMapperConfiguration setDataset(CustomDataset dataset) {
        this.dataset = dataset;
        return this;
    }

    public java.net.URL getUrl() {
        return url;
    }

    public MySQLInputAjilMapperConfiguration setUrl(java.net.URL url) {
        this.url = url;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public MySQLInputAjilMapperConfiguration setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getConfiguration4() {
        return configuration4;
    }

    public MySQLInputAjilMapperConfiguration setConfiguration4(String configuration4) {
        this.configuration4 = configuration4;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public MySQLInputAjilMapperConfiguration setPassword(String password) {
        this.password = password;
        return this;
    }
}