package com.safe.setting.app.di.component;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.safe.setting.app.data.rxFirebase.InterfaceFirebase;
import com.safe.setting.app.di.module.ActivityModule;
import com.safe.setting.app.di.module.ActivityModule_ProvideContextFactory;
import com.safe.setting.app.di.module.ActivityModule_ProvideInterfaceInteractorLoginFactory;
import com.safe.setting.app.di.module.ActivityModule_ProvideInterfaceInteractorRegisterFactory;
import com.safe.setting.app.di.module.ActivityModule_ProvideSupportFragmentManagerFactory;
import com.safe.setting.app.ui.activities.login.InteractorLogin;
import com.safe.setting.app.ui.activities.login.InteractorLogin_Factory;
import com.safe.setting.app.ui.activities.login.InterfaceInteractorLogin;
import com.safe.setting.app.ui.activities.login.InterfaceViewLogin;
import com.safe.setting.app.ui.activities.login.LoginActivity;
import com.safe.setting.app.ui.activities.login.LoginActivity_MembersInjector;
import com.safe.setting.app.ui.activities.mainchild.MainChildActivity;
import com.safe.setting.app.ui.activities.mainchild.MainChildActivity_MembersInjector;
import com.safe.setting.app.ui.activities.mainparent.MainParentActivity;
import com.safe.setting.app.ui.activities.register.InteractorRegister;
import com.safe.setting.app.ui.activities.register.InteractorRegister_Factory;
import com.safe.setting.app.ui.activities.register.InterfaceInteractorRegister;
import com.safe.setting.app.ui.activities.register.InterfaceViewRegister;
import com.safe.setting.app.ui.activities.register.RegisterActivity;
import com.safe.setting.app.ui.activities.register.RegisterActivity_MembersInjector;
import com.safe.setting.app.ui.fragments.maps.MapsFragment;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class DaggerActivityComponent {
  private DaggerActivityComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private AppComponent appComponent;

    private Builder() {
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }

    public ActivityComponent build() {
      Preconditions.checkBuilderRequirement(activityModule, ActivityModule.class);
      Preconditions.checkBuilderRequirement(appComponent, AppComponent.class);
      return new ActivityComponentImpl(activityModule, appComponent);
    }
  }

  private static final class ActivityComponentImpl implements ActivityComponent {
    private final AppComponent appComponent;

    private final ActivityComponentImpl activityComponentImpl = this;

    private Provider<FragmentManager> provideSupportFragmentManagerProvider;

    private Provider<Context> provideContextProvider;

    private Provider<InterfaceFirebase> getInterfaceFirebaseProvider;

    private Provider<InteractorLogin<InterfaceViewLogin>> interactorLoginProvider;

    private Provider<InterfaceInteractorLogin<InterfaceViewLogin>> provideInterfaceInteractorLoginProvider;

    private Provider<InteractorRegister<InterfaceViewRegister>> interactorRegisterProvider;

    private Provider<InterfaceInteractorRegister<InterfaceViewRegister>> provideInterfaceInteractorRegisterProvider;

    private ActivityComponentImpl(ActivityModule activityModuleParam,
        AppComponent appComponentParam) {
      this.appComponent = appComponentParam;
      initialize(activityModuleParam, appComponentParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ActivityModule activityModuleParam,
        final AppComponent appComponentParam) {
      this.provideSupportFragmentManagerProvider = ActivityModule_ProvideSupportFragmentManagerFactory.create(activityModuleParam);
      this.provideContextProvider = ActivityModule_ProvideContextFactory.create(activityModuleParam);
      this.getInterfaceFirebaseProvider = new GetInterfaceFirebaseProvider(appComponentParam);
      this.interactorLoginProvider = InteractorLogin_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorLoginProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorLoginFactory.create(activityModuleParam, interactorLoginProvider));
      this.interactorRegisterProvider = InteractorRegister_Factory.create(provideSupportFragmentManagerProvider, provideContextProvider, getInterfaceFirebaseProvider);
      this.provideInterfaceInteractorRegisterProvider = DoubleCheck.provider(ActivityModule_ProvideInterfaceInteractorRegisterFactory.create(activityModuleParam, interactorRegisterProvider));
    }

    @Override
    public void inject(LoginActivity loginActivity) {
      injectLoginActivity(loginActivity);
    }

    @Override
    public void inject(RegisterActivity registerActivity) {
      injectRegisterActivity(registerActivity);
    }

    @Override
    public void inject(MainParentActivity mainParentActivity) {
    }

    @Override
    public void inject(MainChildActivity mainChildActivity) {
      injectMainChildActivity(mainChildActivity);
    }

    @Override
    public void inject(MapsFragment mapsFragment) {
    }

    @CanIgnoreReturnValue
    private LoginActivity injectLoginActivity(LoginActivity instance) {
      LoginActivity_MembersInjector.injectInteractor(instance, provideInterfaceInteractorLoginProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private RegisterActivity injectRegisterActivity(RegisterActivity instance) {
      RegisterActivity_MembersInjector.injectInteractor(instance, provideInterfaceInteractorRegisterProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MainChildActivity injectMainChildActivity(MainChildActivity instance) {
      MainChildActivity_MembersInjector.injectFirebase(instance, Preconditions.checkNotNullFromComponent(appComponent.getInterfaceFirebase()));
      return instance;
    }

    private static final class GetInterfaceFirebaseProvider implements Provider<InterfaceFirebase> {
      private final AppComponent appComponent;

      GetInterfaceFirebaseProvider(AppComponent appComponent) {
        this.appComponent = appComponent;
      }

      @Override
      public InterfaceFirebase get() {
        return Preconditions.checkNotNullFromComponent(appComponent.getInterfaceFirebase());
      }
    }
  }
}
