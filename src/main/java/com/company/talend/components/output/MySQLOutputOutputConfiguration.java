package com.company.talend.components.output;

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
    @GridLayout.Row({ "password" }),
    @GridLayout.Row({ "table" })
})
@Documentation("TODO fill the documentation for this configuration")
public class MySQLOutputOutputConfiguration implements Serializable {
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private CustomDataset dataset;

    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private java.net.URL url;

    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String username;

    @Credential
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String password;

    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String table;

    public CustomDataset getDataset() {
        return dataset;
    }

    public MySQLOutputOutputConfiguration setDataset(CustomDataset dataset) {
        this.dataset = dataset;
        return this;
    }

    public java.net.URL getUrl() {
        return url;
    }

    public MySQLOutputOutputConfiguration setUrl(java.net.URL url) {
        this.url = url;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public MySQLOutputOutputConfiguration setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public MySQLOutputOutputConfiguration setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getTable() {
        return table;
    }

    public MySQLOutputOutputConfiguration setTable(String table) {
        this.table = table;
        return this;
    }
}